.class public final enum LYue/ۥ۠ۤۧۢ$ۥ۟۟۟ۦ;
.super LYue/ۥ۠ۤۧۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۠ۤۧۢ;-><init>(Ljava/lang/String;ILYue/ۥ۠ۤۧۢ$ۥ۟۟۟ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۦ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۡ;)Z
    .locals 7

    const-string v0, "html"

    const-string v1, "frameset"

    const/4 v2, 0x0

    invoke-static {p1}, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۟(LYue/ۥۢۡۧ۠;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤ۟(LYue/ۥۢۡۧ۠$ۥ۟۟;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۦ()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟()LYue/ۥۢۡۧ۠$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤۡ(LYue/ۥۢۡۧ۠$ۥ۟۟۟;)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v2

    :cond_2
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۠()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۡ()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۥ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const/4 v5, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "noframes"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "frame"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    move v5, v4

    goto :goto_0

    :sswitch_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    move v5, v2

    :goto_0
    packed-switch v5, :pswitch_data_0

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v2

    :pswitch_0
    sget-object v0, LYue/ۥ۠ۤۧۢ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥۣ۟۟ۤ(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;)LYue/ۥ۠۠ۥۥ;

    goto :goto_1

    :pswitch_2
    sget-object v0, LYue/ۥ۠ۤۧۢ;->ۥ۟۟ۡ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1, v0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۦۨ(LYue/ۥۢۡۧ۠;LYue/ۥ۠ۤۧۢ;)Z

    move-result p1

    return p1

    :pswitch_3
    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۤۢ(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;)LYue/ۥ۠۠ۥۥ;

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۟()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟۠()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۡ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۥ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {p2, v0}, LYue/ۥۢۢۡۧ;->ۥ۟(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v2

    :cond_8
    invoke-virtual {p2}, LYue/ۥۢۢۡۧ;->ۥ۟۟۠()LYue/ۥ۠۠ۥۥ;

    invoke-virtual {p2}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۥ۟()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p2, v1}, LYue/ۥۢۢۡۧ;->ۥ۟(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    sget-object p1, LYue/ۥ۠ۤۧۢ;->ۥ۟۟ۢۡ:LYue/ۥ۠ۤۧۢ;

    invoke-virtual {p2, p1}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۨۥ(LYue/ۥ۠ۤۧۢ;)V

    goto :goto_1

    :cond_9
    invoke-virtual {p1}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۨ()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p2, v0}, LYue/ۥۢۢۡۧ;->ۥ۟(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    :cond_a
    :goto_1
    return v4

    :cond_b
    invoke-virtual {p2, p0}, LYue/ۥ۠ۤۧۡ;->ۥ۟۟ۢ(LYue/ۥ۠ۤۧۢ;)V

    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x620c002b -> :sswitch_3
        0x3107ab -> :sswitch_2
        0x5d2a96d -> :sswitch_1
        0x47177da7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
