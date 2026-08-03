.class Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;
.super Lcom/google/gson/TypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->localDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Ljava/time/LocalDateTime;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$localDateAdapter:Lcom/google/gson/TypeAdapter;

.field final synthetic val$localTimeAdapter:Lcom/google/gson/TypeAdapter;


# direct methods
.method public constructor <init>(Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localDateAdapter:Lcom/google/gson/TypeAdapter;

    iput-object p2, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localTimeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->read(Lcom/google/gson/stream/JsonReader;)Ljava/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/time/LocalDateTime;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    const-string v0, "time"

    const-string v1, "date"

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V

    const/4 v2, 0x0

    move-object v3, v2

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v4

    sget-object v5, Lcom/google/gson/stream/JsonToken;->END_OBJECT:Lcom/google/gson/stream/JsonToken;

    if-eq v4, v5, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->skipValue()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v3, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localTimeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v3, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/time/LocalTime;

    goto :goto_0

    .line 8
    :cond_1
    iget-object v2, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localDateAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v2, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/time/LocalDate;

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V

    .line 10
    invoke-static {v2, v1, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$000(Ljava/lang/Object;Ljava/lang/String;Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/time/LocalDate;

    invoke-static {v3, v0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->access$000(Ljava/lang/Object;Ljava/lang/String;Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/time/LocalTime;

    .line 11
    invoke-static {v1, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p2, Ljava/time/LocalDateTime;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->write(Lcom/google/gson/stream/JsonWriter;Ljava/time/LocalDateTime;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/time/LocalDateTime;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;

    .line 3
    const-string v0, "date"

    invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 4
    iget-object v0, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localDateAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {p2}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 5
    const-string v0, "time"

    invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    .line 6
    iget-object v0, p0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;->val$localTimeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {p2}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;

    return-void
.end method
