.class public final Lyyds/ᛴᛸᛴᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᲇᛴᲀ;


# static fields
.field public static final ᛷᲈᲈᲁ:Lyyds/ᛴᛸᛴᲁ;


# instance fields
.field public final ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛲᛳᛵᛱ;

.field public ᛲᛴᛳᛲ:Z

.field public ᛶᛷᛲᲁ:Landroid/os/Handler;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛴᛸᛴᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛴᛸᛴᲁ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛴᛸᛴᲁ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛸᛴᲁ;

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
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲇᲇᛱ:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/ᛲᲈᲁ;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/ᛲᲈᲁ;-><init>(Lyyds/ᲁᲇᛴᲀ;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 15
    .line 16
    new-instance v0, Lyyds/ᛲᛳᛵᛱ;

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛳᛵᛱ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    return-object p0
.end method
