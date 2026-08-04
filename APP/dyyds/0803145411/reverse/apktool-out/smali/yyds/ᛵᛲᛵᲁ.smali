.class public final Lyyds/ᛵᛲᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛵᛲᛵᲁ;


# instance fields
.field public volatile ᛲᲈᲁ:Ljava/lang/Thread;

.field public volatile ᛵᛸᛸᛷ:Lyyds/ᛵᛲᛵᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛵᛲᛵᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛵᛲᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛲᛵᲁ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyyds/ᲈᛳᛵᛴ;->ᛱᲈᲁ:Lyyds/ᛲᛷᛵᲇ;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, p0, v1}, Lyyds/ᛲᛷᛵᲇ;->ᛲᛲᲈᲈ(Lyyds/ᛵᛲᛵᲁ;Ljava/lang/Thread;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
