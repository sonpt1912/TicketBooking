package com.example.be.service;

import com.example.be.entity.TicketPrice;
import com.example.be.request.TicketPriceRequest;
import com.example.be.response.TicketPriceResponse;
import org.springframework.data.domain.Page;

public interface TicketPriceService {
    Page<TicketPriceResponse> getAll(Integer pageNo);

    void save(TicketPriceRequest ticketPriceRequest);

    void update(Long id, TicketPriceRequest ticketPriceRequest);

    TicketPrice getTicketPriceByChairType_IdAndTypeTicket_Id(Long chairTypeId, Long typeTicketId);

}
