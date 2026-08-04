.class public final synthetic Lyyds/ᲇᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛳᲈᛵᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛳᲈᛵᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛳᲈᛵᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛳᲈᛵᲈ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lyyds/ᛳᲈᛵᲈ;->ᛷᲈᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/database/Cursor;

    .line 8
    .line 9
    return-object p0
.end method
