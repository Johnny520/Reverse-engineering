.class public final Lyyds/ᲁᛵᛳᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛲᲀ;


# instance fields
.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:Lyyds/ᲁᛸᛴᲇ;

.field public ᲀᛲᛳᲀ:Lyyds/ᲁᛸᛴᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛵᛷᛲᲀ;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛵᛷᛲᲀ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᲁᛵᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛲᲀ;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛲᲈᲁ()Lyyds/ᲁᛵᛳᛱ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲁᛵᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛷᛲᲀ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛵᛷᛲᲀ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyyds/ᲁᛵᛳᛱ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lyyds/ᲁᛵᛳᛱ;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method
