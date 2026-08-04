.class public final Lyyds/ᛸᛴᛶᲈ;
.super Ljava/lang/Object;


# instance fields
.field private ᛲᲈᲁ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "key"
    .end annotation
.end field

.field private ᛵᛸᛸᛷ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "value"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x119

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x2034fe68a836eL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyyds/ᛸᛴᛶᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    const-wide v0, -0x20350e68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lyyds/ᛸᛴᛶᲈ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final native ᛲᲈᲁ()Ljava/lang/String;
.end method

.method public final native ᛵᛸᛸᛷ()Ljava/lang/String;
.end method
