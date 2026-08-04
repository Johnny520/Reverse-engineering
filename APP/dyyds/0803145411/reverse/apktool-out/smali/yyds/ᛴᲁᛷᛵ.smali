.class public final Lyyds/ᛴᲁᛷᛵ;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲀᛱᲇᛵ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᲀᛱᲇᛵ;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v0, p1}, Lyyds/ᲀᛱᲇᛵ;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛴᲁᛷᛵ;->ᛲᲈᲁ:Lyyds/ᲀᛱᲇᛵ;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᲁᛷᛵ;->ᛲᲈᲁ:Lyyds/ᲀᛱᲇᛵ;

    .line 2
    .line 3
    return-object p0
.end method
