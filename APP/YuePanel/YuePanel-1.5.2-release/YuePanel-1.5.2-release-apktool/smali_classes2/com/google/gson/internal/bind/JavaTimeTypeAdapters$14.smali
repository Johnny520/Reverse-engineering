.class Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/Gson;",
            "Lcom/google/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.time."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-class v0, Ljava/time/Duration;

    if-ne p2, v0, :cond_1

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$100()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto/16 :goto_1

    :cond_1
    const-class v0, Ljava/time/Instant;

    if-ne p2, v0, :cond_2

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$200()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto/16 :goto_1

    :cond_2
    const-class v0, Ljava/time/LocalDate;

    if-ne p2, v0, :cond_3

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$300()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_3
    const-class v0, Ljava/time/LocalTime;

    if-ne p2, v0, :cond_4

    sget-object v1, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->LOCAL_TIME:Lcom/google/gson/TypeAdapter;

    goto :goto_1

    :cond_4
    const-class v0, Ljava/time/LocalDateTime;

    if-ne p2, v0, :cond_5

    invoke-static {p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$400(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_5
    const-class v0, Ljava/time/MonthDay;

    if-ne p2, v0, :cond_6

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$500()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_6
    const-class v0, Ljava/time/OffsetDateTime;

    if-ne p2, v0, :cond_7

    invoke-static {p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$600(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_7
    const-class v0, Ljava/time/OffsetTime;

    if-ne p2, v0, :cond_8

    invoke-static {p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$700(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_8
    const-class v0, Ljava/time/Period;

    if-ne p2, v0, :cond_9

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$800()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_9
    const-class v0, Ljava/time/Year;

    if-ne p2, v0, :cond_a

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$900()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_a
    const-class v0, Ljava/time/YearMonth;

    if-ne p2, v0, :cond_b

    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$1000()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_b
    const-class v0, Ljava/time/ZoneId;

    if-eq p2, v0, :cond_d

    const-class v0, Ljava/time/ZoneOffset;

    if-ne p2, v0, :cond_c

    goto :goto_0

    :cond_c
    const-class v0, Ljava/time/ZonedDateTime;

    if-ne p2, v0, :cond_e

    invoke-static {p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$1200(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    goto :goto_1

    :cond_d
    :goto_0
    invoke-static {}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$1100()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    :cond_e
    :goto_1
    return-object v1
.end method
