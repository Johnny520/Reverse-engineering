.class public final Lxhss/ᛷᛸᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛷᲀᲁ;


# static fields
.field public static final ᛸᛴᛶᛳ:Lxhss/ᛷᛸᛴᛵ;


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Z

.field public ᛷᛴᛷᛱ:Landroid/os/Handler;

.field public ᛷᛵᛵᲈ:I

.field public final ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᛲ;

.field public ᲇᛴᲇᛵ:Z

.field public final ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛷᛸᛴᛵ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛷᛸᛴᛵ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛸᛴᛵ;

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
    iput-boolean v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᛳᲁᲇᛸ:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;-><init>(Lxhss/ᛴᛷᲀᲁ;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 15
    .line 16
    new-instance v0, Lxhss/ᛳᛶᲈᛲ;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, v1, p0}, Lxhss/ᛳᛶᲈᛲ;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᛲ;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method
