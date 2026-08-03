.class public LYue/ۥ۟ۢۤۨ;
.super LYue/ۥ۠ۤۤ۟;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۟۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟;

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢ۠۟۟;)V
    .locals 1

    sget-object v0, LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;

    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۤۤ۟;-><init>(LYue/ۥۢ۠۟۟;LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()V
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۢۤۨ;->ۥ۟۟()LYue/ۥ۠ۤۤۡ;

    sget-object v0, LYue/ۥ۟ۢۤۨ$ۥ;->ۥ:[I

    iget-object v1, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v1, 0x3

    goto :goto_0

    :pswitch_1
    const/4 v1, 0x2

    goto :goto_0

    :pswitch_2
    const/4 v1, 0x1

    :goto_0
    :pswitch_3
    iget-object v0, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢۤۧ;->ۥ۟۠ۢۤ(I)V

    iget-object v0, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;

    iget v1, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟۠:I

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢۤۧ;->ۥ۟۠ۢۥ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۥ۟۟()LYue/ۥ۠ۤۤۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۢۤۧ;

    invoke-direct {v0}, LYue/ۥ۟ۢۤۧ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢۤۧ;

    return-object v0
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟۠:I

    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۤ۟;->ۥ:LYue/ۥۢ۠۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟۠(I)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۢ۠۟۟$ۥ۟۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢۤۨ;->ۥ۟۟۟۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟;

    return-void
.end method
