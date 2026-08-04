.class public final Lyyds/ᛲᛵᛷᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛷ;


# instance fields
.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛴᛷᛷ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᛷᛷ;

.field public final ᲇᲈᛵᛷ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;Lyyds/ᛴᛷᛷ;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᛲᛵᛷᛲ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lyyds/ᛲᛵᛷᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛷᛷ;

    .line 11
    .line 12
    iput-object p3, p0, Lyyds/ᛲᛵᛷᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛷᛷ;

    .line 13
    .line 14
    iput-object p4, p0, Lyyds/ᛲᛵᛷᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Class;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;
    .locals 10

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Landroid/net/Uri;

    .line 3
    .line 4
    new-instance p1, Lyyds/ᛵᲁᛴᛱ;

    .line 5
    .line 6
    new-instance v9, Lyyds/ᛸᛷᛴᲁ;

    .line 7
    .line 8
    invoke-direct {v9, v4}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lyyds/ᛷᲇᲈᲇ;

    .line 12
    .line 13
    iget-object v3, p0, Lyyds/ᛲᛵᛷᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛷᛷ;

    .line 14
    .line 15
    iget-object v8, p0, Lyyds/ᛲᛵᛷᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object v1, p0, Lyyds/ᛲᛵᛷᛲ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᛲᛵᛷᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛷᛷ;

    .line 20
    .line 21
    move v5, p2

    .line 22
    move v6, p3

    .line 23
    move-object v7, p4

    .line 24
    invoke-direct/range {v0 .. v8}, Lyyds/ᛷᲇᲈᲇ;-><init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;Lyyds/ᛴᛷᛷ;Landroid/net/Uri;IILyyds/ᛴᛳᲀᲈ;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v9, v0}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
