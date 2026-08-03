.class public LYue/ۥۢۦۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦۡ;


# instance fields
.field public ۥ:LYue/ۥۢۦۡۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LYue/ۥۢۦۡۡ;->ۥ۟۟ۡ()LYue/ۥۢۦۡۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    return-void
.end method

.method public static ۥ۟۟۠۟(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;
    .locals 10

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۥ()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LYue/ۥ۠۠ۨ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨ;

    return-object p0

    :cond_0
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۥ()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    new-instance v9, LYue/ۥۣ۟ۢ۠;

    invoke-interface {p0, v2}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢ۟(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v2}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۦ(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v2}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢ۠(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v2}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠۠(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0, v2}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۤۥ(I)Ljava/lang/String;

    move-result-object v8

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LYue/ۥۣ۟ۢ۠;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۠(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;
    .locals 5

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۢ()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LYue/ۥ۠۠ۨ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨ;

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۢ()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-interface {p0, v1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡۢ(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, LYue/ۥۡۢ۠ۤ;

    invoke-interface {p0, v1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۤ(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, LYue/ۥۡۢ۠ۤ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v2, LYue/ۥۡۢ۠ۤ;

    invoke-interface {p0, v1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۤ(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, LYue/ۥۡۢ۠ۤ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonStaticAllocator"

    return-object v0
.end method

.method public ۥ(LYue/ۥۢۦۢۤ;)LYue/ۥۢۦ۠ۨ;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, LYue/ۥۢۦۢۢ;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unable to allocate event["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, " , "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result p1

    invoke-static {p1}, LYue/ۥ۠۠ۥۦ;->ۥ۟(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۡ(LYue/ۥۢۦۢۤ;)LYue/ۥ۟ۨ۟ۨ;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۤ(LYue/ۥۢۦۢۤ;)LYue/ۥ۠ۡ۟ۤ;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۢ(LYue/ۥۢۦۢۤ;)LYue/ۥ۠۠ۨۧ;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۧ(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟۠(LYue/ۥۢۦۢۤ;)LYue/ۥ۟ۥۤۥ;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۥ(LYue/ۥۢۦۢۤ;)LYue/ۥۡۥۡ۠;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥۣ۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥ۠ۡ;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۟ۨ(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۤ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ(LYue/ۥۢۦۢۤ;)LYue/ۥۢۦ۠ۨ;

    move-result-object p1

    invoke-interface {p2, p1}, LYue/ۥۢۦۡ۠;->ۥ۟۟۟(LYue/ۥۢۦ۠ۨ;)V

    return-void
.end method

.method public ۥ۟۟()LYue/ۥۢۦۡ;
    .locals 1

    new-instance v0, LYue/ۥۢۦۡ۟;

    invoke-direct {v0}, LYue/ۥۢۦۡ۟;-><init>()V

    return-object v0
.end method

.method public ۥ۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۡ()I

    move-result v0

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡ۟()I

    move-result v1

    new-instance v2, Ljava/lang/String;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟۠()[C

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۤ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1, v2}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1, v2}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠(LYue/ۥۢۦۢۤ;)LYue/ۥ۟ۥۤۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟۠(Ljava/lang/String;)LYue/ۥ۟ۥۤۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۢۦۢۤ;)LYue/ۥ۟ۨ۟ۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۨۤۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۨۤۥ;

    new-instance v1, LYue/ۥ۟ۨۡ۠;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, LYue/ۥ۟ۨۡ۠;-><init>(Ljava/lang/String;)V

    const-string p1, "javax.xml.stream.notations"

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۤۥ;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۨۡ۠;->ۥ۟۟ۦ۠(Ljava/util/List;)V

    const-string p1, "javax.xml.stream.entities"

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۤۥ;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۨۡ۠;->ۥ۟۟ۦ۟(Ljava/util/List;)V

    return-object v1

    :cond_0
    iget-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۨ۟ۨ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۢۦۢۤ;)LYue/ۥ۠۠ۨۧ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟ۢ()LYue/ۥ۠۠ۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۟(LYue/ۥۢۦۢۤ;)LYue/ۥ۠ۡ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v0, :cond_0

    move-object v0, v2

    :cond_0
    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    iget-object v2, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۠(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object p1

    invoke-virtual {v2, v0, v1, v3, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)LYue/ۥ۠ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥۢۦۢۤ;)LYue/ۥ۠ۡ۟ۤ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p1, LYue/ۥ۠ۨۤۥ;

    new-instance v1, LYue/ۥ۠ۡ۟ۢ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, LYue/ۥ۠ۡ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;LYue/ۥ۠ۡ۟ۡ;)LYue/ۥ۠ۡ۟ۤ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥۢۦۢۤ;)LYue/ۥۡۥۡ۠;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۥۡ۠;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۢۦۢۤ;)LYue/ۥۣ۟ۤۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۢ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۤ;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v0, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    if-nez v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    iget-object v3, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۟(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object v7

    invoke-static {p1}, LYue/ۥۢۦۡ۟;->ۥ۟۟۠۠(LYue/ۥۢۦۢۤ;)Ljava/util/Iterator;

    move-result-object v8

    invoke-virtual/range {v3 .. v8}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)LYue/ۥۢ۟ۨۤ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠(LYue/ۥۢۦۢۤ;)LYue/ۥۢ۟ۨۢ;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۟ۧ()Z

    move-result p1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-nez p1, :cond_0

    iget-object v2, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {v2, v0, v1, p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠ۤ(Ljava/lang/String;Ljava/lang/String;Z)LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۦۡۡ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v0, :cond_2

    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1, v0}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠ۢ(Ljava/lang/String;)LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, LYue/ۥۢۦۡ۟;->ۥ:LYue/ۥۢۦۡۡ;

    invoke-virtual {p1}, LYue/ۥۢۦۡۡ;->ۥ۟۟۠ۡ()LYue/ۥۢ۟ۨۢ;

    move-result-object p1

    return-object p1
.end method
