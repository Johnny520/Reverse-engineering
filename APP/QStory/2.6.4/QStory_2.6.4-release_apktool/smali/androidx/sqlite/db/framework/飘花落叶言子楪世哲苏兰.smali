.class public final Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public static final 飘花落叶言子楪哲兰世苏:[Ljava/lang/String;

.field public static final 飘花落叶言子楪哲兰苏世:Lkotlin/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/String;

    .line 5
    .line 6
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 7
    .line 8
    new-instance v1, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-direct {v1, v2}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    new-instance v1, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v1, v2}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getVersion()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isReadOnly()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世兰楪哲苏()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世兰苏哲楪()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子世哲兰楪苏()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->getPageSize()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final 飘花落叶言子世楪哲兰苏(Ljava/lang/String;)L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/sqlite/db/framework/飘花落叶言子楪苏哲世兰;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Landroidx/sqlite/db/framework/飘花落叶言子楪苏哲世兰;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final 飘花落叶言子世楪苏兰哲()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isDatabaseIntegrityOk()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世苏哲兰楪()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    sget-object v2, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    invoke-interface {v2}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    filled-new-array {v0, v3, v0, v3}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    const-string p0, "Required value was null."

    .line 62
    .line 63
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    invoke-virtual {p0}, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final 飘花落叶言子哲世兰楪苏(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->setPageSize(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子哲世楪苏兰()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪兰世哲苏()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->disableWriteAheadLogging()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子苏世兰哲楪()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isDbLockedByCurrentThread()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子苏世楪兰哲()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->yieldIfContendedSafely()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子苏兰世哲楪(Landroidx/core/view/飘花落叶言子楪世兰哲苏;)Landroid/database/Cursor;
    .locals 3

    .line 1
    new-instance v0, Landroidx/sqlite/db/framework/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Landroidx/sqlite/db/framework/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Landroidx/sqlite/db/framework/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Landroidx/sqlite/db/framework/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/sqlite/db/framework/飘花落叶言子楪世苏哲兰;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 22
    .line 23
    invoke-virtual {p0, v1, p1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final 飘花落叶言子苏哲楪世兰()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏楪世兰哲()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏楪世哲兰()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/sqlite/db/framework/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->getMaximumSize()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
