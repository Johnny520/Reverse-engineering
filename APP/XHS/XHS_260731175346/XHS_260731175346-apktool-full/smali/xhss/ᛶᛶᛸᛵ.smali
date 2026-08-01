.class public final Lxhss/ᛶᛶᛸᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛲᛳᛳᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛷᛴᛲᛲ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛴᛲᛲ;Lxhss/ᲇᛱᲈᛸ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxhss/ᛶᛶᛸᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛶᛶᛸᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛴᛲᛲ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲀᲇᛱ;)V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛶᛶᛸᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x124b81b858845L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᛶᛶᛸᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛴᛲᛲ;

    .line 15
    .line 16
    :try_start_0
    invoke-interface {p0, p1}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-wide v0, -0x124c11b858845L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᲁᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    :pswitch_0
    const-wide p0, -0x141531b858845L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛵᛴᛲᛵ;)V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛶᛶᛸᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide p0, -0x1415c1b858845L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-wide v0, -0x106881b858845L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lxhss/ᛶᛶᛸᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛴᛲᛲ;

    .line 24
    .line 25
    :try_start_0
    invoke-interface {p0, p1}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, p1

    .line 38
    :goto_0
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-wide v0, -0x106911b858845L

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᲁᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
