.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟ۡ۟;
.super LYue/ۥۢۡۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥۢۡۧۥ;-><init>(Ljava/lang/String;ILYue/ۥۢۡۧۥ$ۥ۟۟۟ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۧ(LYue/ۥۢۡۧۤ;LYue/ۥۣ۟ۤۤ;)V
    .locals 3

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟ۡ()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_4

    const/16 v1, 0x22

    if-eq v0, v1, :cond_2

    const/16 v1, 0x27

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_4

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    const/16 v1, 0xd

    if-eq v0, v1, :cond_4

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۤ()V

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟۠()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟ۤ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟۠()V

    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    :pswitch_1
    invoke-virtual {p1}, LYue/ۥۢۡۧۤ;->ۥۣ۟۟۠()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۢۡۧۥ;)V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_1
    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۤ۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object v1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {v1}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۤ()V

    iget-object v1, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result p2

    invoke-virtual {v1, v0, v2, p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟(CII)V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟ۤ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟۠()V

    invoke-virtual {p1, p0}, LYue/ۥۢۡۧۤ;->ۥ۟۟۠ۥ(LYue/ۥۢۡۧۥ;)V

    iget-object p2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۤ()V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟ۤ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    :cond_4
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
