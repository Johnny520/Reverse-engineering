.class public final Lyyds/ᛵᲈᛷᛸ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:I

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x103

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/ugc/aweme/comment/model/Comment;ILandroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛵᲈᛷᛸ;->ᛶᛷᛲᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᲈᛷᛸ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛵᲈᛷᛸ;->ᛲᛳᛶᲁ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛵᲈᛷᛸ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lyyds/ᛲᲈᛷᛳ;ILyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛵᲈᛷᛸ;->ᛶᛷᛲᲁ:I

    .line 15
    iput-object p1, p0, Lyyds/ᛵᲈᛷᛸ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    iput p2, p0, Lyyds/ᛵᲈᛷᛸ;->ᛲᛳᛶᲁ:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method


# virtual methods
.method public final native ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
.end method

.method public final native ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
