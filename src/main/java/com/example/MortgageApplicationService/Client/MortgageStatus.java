package com.example.MortgageApplicationService.Client;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum MortgageStatus {
    PROCESSING,
    APPROVED,
    DENIED
}
