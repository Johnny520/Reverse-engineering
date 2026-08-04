.class public final Lyyds/ᛷᲁᛸᛶ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛷᲁᛸᛶ;->ᛱᲈᲁ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛷᲁᛸᛶ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    .line 17
    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/content/Context;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    .line 18
    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/ugc/aweme/emoji/model/Emoji;Landroid/content/Context;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    .line 19
    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 20
    iput p5, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛷᲁᛸᛶ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 21
    iput p4, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᲀᛸᛸ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lyyds/ᛷᲁᛸᛶ;->ᛶᛷᛲᲁ:I

    .line 22
    iput-object p1, p0, Lyyds/ᛷᲁᛸᛶ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method private final native ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method private final native ᲇᛱᛲ(Ljava/lang/Object;)Ljava/lang/Object;
.end method


# virtual methods
.method public final native ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
.end method

.method public final native ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
