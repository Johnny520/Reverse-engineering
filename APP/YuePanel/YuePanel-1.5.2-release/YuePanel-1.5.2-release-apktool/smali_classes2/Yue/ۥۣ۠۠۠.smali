.class public LYue/ۥۣ۠۠۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠۠۠$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(DLYue/ۥۣ۠۠;LYue/ۥۣ۠۠;)D
    .locals 6
    .param p2    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "sourceUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUnit"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object v0

    invoke-virtual {p2}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-lez v4, :cond_0

    long-to-double p2, v0

    mul-double/2addr p0, p2

    return-wide p0

    :cond_0
    invoke-virtual {p2}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    invoke-virtual {p3}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p3

    invoke-virtual {p2, v2, v3, p3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p2

    long-to-double p2, p2

    div-double/2addr p0, p2

    return-wide p0
.end method

.method public static final ۥ۟(JLYue/ۥۣ۠۠;LYue/ۥۣ۠۠;)J
    .locals 1
    .param p2    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    const-string v0, "sourceUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUnit"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p3

    invoke-virtual {p2}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    invoke-virtual {p3, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟(JLYue/ۥۣ۠۠;LYue/ۥۣ۠۠;)J
    .locals 1
    .param p2    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    const-string v0, "sourceUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUnit"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p3

    invoke-virtual {p2}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    invoke-virtual {p3, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟(Ljava/util/concurrent/TimeUnit;)LYue/ۥۣ۠۠;
    .locals 1
    .param p0    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۡ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣ۠۠۠$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, LYue/ۥۣۣۡۢ;

    invoke-direct {p0}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟ۡ۟:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_1
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟ۡ:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_2
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۨ:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_3
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_4
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۦ:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_5
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۠;

    goto :goto_0

    :pswitch_6
    sget-object p0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠۠;)Ljava/util/concurrent/TimeUnit;
    .locals 1
    .param p0    # LYue/ۥۣ۠۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۡ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠;->ۥ۟۟۟۟()Ljava/util/concurrent/TimeUnit;

    move-result-object p0

    return-object p0
.end method
