.class Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$4;
.super Lcom/google/gson/internal/bind/TypeAdapters$IntegerFieldsTypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/internal/bind/TypeAdapters$IntegerFieldsTypeAdapter<",
        "Ljava/time/LocalTime;",
        ">;"
    }
.end annotation


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$IntegerFieldsTypeAdapter;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic create([J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$4;->create([J)Ljava/time/LocalTime;

    move-result-object p1

    return-object p1
.end method

.method public create([J)Ljava/time/LocalTime;
    .locals 5

    const/4 v0, 0x0

    .line 2
    aget-wide v0, p1, v0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->toIntExact(J)I

    move-result v0

    const/4 v1, 0x1

    aget-wide v1, p1, v1

    .line 4
    invoke-static {v1, v2}, Ljava/lang/Math;->toIntExact(J)I

    move-result v1

    const/4 v2, 0x2

    aget-wide v2, p1, v2

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Math;->toIntExact(J)I

    move-result v2

    const/4 v3, 0x3

    aget-wide v3, p1, v3

    .line 6
    invoke-static {v3, v4}, Ljava/lang/Math;->toIntExact(J)I

    move-result p1

    .line 7
    invoke-static {v0, v1, v2, p1}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic integerValues(Ljava/lang/Object;)[J
    .locals 0

    .line 1
    check-cast p1, Ljava/time/LocalTime;

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$4;->integerValues(Ljava/time/LocalTime;)[J

    move-result-object p1

    return-object p1
.end method

.method public integerValues(Ljava/time/LocalTime;)[J
    .locals 9

    .line 2
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1}, Ljava/time/LocalTime;->getSecond()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {p1}, Ljava/time/LocalTime;->getNano()I

    move-result p1

    int-to-long v6, p1

    const/4 p1, 0x4

    new-array p1, p1, [J

    const/4 v8, 0x0

    aput-wide v0, p1, v8

    const/4 v0, 0x1

    aput-wide v2, p1, v0

    const/4 v0, 0x2

    aput-wide v4, p1, v0

    const/4 v0, 0x3

    aput-wide v6, p1, v0

    return-object p1
.end method
