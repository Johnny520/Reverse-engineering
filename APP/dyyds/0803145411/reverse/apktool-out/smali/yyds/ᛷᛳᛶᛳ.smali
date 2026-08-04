.class public final Lyyds/ᛷᛳᛶᛳ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:I

.field public ᛲᛲᲈᲈ:Ljava/util/Iterator;

.field public ᛲᛳᛶᲁ:I

.field public final synthetic ᛳᲁᲁᲇ:Ljava/util/List;

.field public final synthetic ᛵᛶᛲᲀ:Landroid/content/Context;

.field public final synthetic ᛶᛳᛶᛵ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;

.field public ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᛷᛵᲇᲀ:Lyyds/ᛷᲀᛳᛱ;

.field public ᛷᲈᲈᲁ:I

.field public final synthetic ᲇᛱᛲ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xea

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Landroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛷᛳᛶᛳ;->ᛳᲁᲁᲇ:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛷᛳᛶᛳ;->ᲇᛱᛲ:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛷᛳᛶᛳ;->ᛶᛳᛶᛵ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 6
    .line 7
    iput-object p4, p0, Lyyds/ᛷᛳᛶᛳ;->ᛵᛶᛲᲀ:Landroid/content/Context;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final native ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
.end method

.method public final native ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
