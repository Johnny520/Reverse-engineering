.class public final Lyyds/ᛵᛲᛴᲇ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᛳᲇ:Z

.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛲᲈᲈ:Ljava/lang/Integer;

.field public synthetic ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;

.field public final synthetic ᛷᛵᲇᲀ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

.field public final synthetic ᛷᲈᲈᲁ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4c

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;ZLyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p7, p0, Lyyds/ᛵᛲᛴᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛲᛴᲇ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᛲᛴᲇ;->ᛷᛲᲈᛱ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛵᛲᛴᲇ;->ᛷᛵᲇᲀ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᛵᛲᛴᲇ;->ᛲᛲᲈᲈ:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-boolean p5, p0, Lyyds/ᛵᛲᛴᲇ;->ᛱᛳᲇ:Z

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p6}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 15
    .line 16
    .line 17
    return-void
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
