.class Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$2;
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
        "Ljava/time/Instant;",
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
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$2;->create([J)Ljava/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method public create([J)Ljava/time/Instant;
    .locals 4

    const/4 v0, 0x0

    .line 2
    aget-wide v0, p1, v0

    const/4 v2, 0x1

    aget-wide v2, p1, v2

    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic integerValues(Ljava/lang/Object;)[J
    .locals 0

    .line 1
    check-cast p1, Ljava/time/Instant;

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$2;->integerValues(Ljava/time/Instant;)[J

    move-result-object p1

    return-object p1
.end method

.method public integerValues(Ljava/time/Instant;)[J
    .locals 5

    .line 2
    invoke-virtual {p1}, Ljava/time/Instant;->getEpochSecond()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/time/Instant;->getNano()I

    move-result p1

    int-to-long v2, p1

    const/4 p1, 0x2

    new-array p1, p1, [J

    const/4 v4, 0x0

    aput-wide v0, p1, v4

    const/4 v0, 0x1

    aput-wide v2, p1, v0

    return-object p1
.end method
