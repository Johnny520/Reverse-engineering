.class public final Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 17
    .line 18
    const/16 p2, 0xa

    .line 19
    .line 20
    invoke-direct {p1, p0, p2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/sqlite/db/framework/飘花落叶言子楪世兰哲苏;->close()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/sqlite/db/framework/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-boolean p1, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子苏世楪哲兰()L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Landroidx/sqlite/db/framework/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Z)L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
