.class public final Lyyds/ᛳᛴᲀᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛴᛳᲈᛵ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛴᛳᲈᛵ;

.field public static final ᲇᲈᛵᛷ:[Ljava/lang/String;


# instance fields
.field public final ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, Lyyds/ᛳᛴᲀᛷ;->ᲇᲈᛵᛷ:[Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Lyyds/ᲁᲀᛳ;

    .line 7
    .line 8
    const/16 v1, 0x12

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lyyds/ᲁᲀᛳ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-static {v1, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛶᛷᛲᲁ(ILyyds/ᲁᛶᲁᲀ;)Lyyds/ᛴᛳᲈᛵ;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lyyds/ᛳᛴᲀᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛳᲈᛵ;

    .line 19
    .line 20
    new-instance v0, Lyyds/ᲁᲀᛳ;

    .line 21
    .line 22
    const/16 v2, 0x13

    .line 23
    .line 24
    invoke-direct {v0, v2}, Lyyds/ᲁᲀᛳ;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛶᛷᛲᲁ(ILyyds/ᲁᛶᲁᲀ;)Lyyds/ᛴᛳᲈᛵ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lyyds/ᛳᛴᲀᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛳᲈᛵ;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

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

.method public final ᛲᲈᲁ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛳᲁᲁᲇ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛶᛳᛶᛵ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

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

.method public final ᛶᛷᛲᲁ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛷᲈᲈᲁ(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
