.class public final Lxhss/ᛶᲈᲈᛷ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/List;

.field public ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x106a51b858845L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const-wide v1, -0x106ab1b858845L

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lxhss/ᛶᲈᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    iput-object v0, p0, Lxhss/ᛶᲈᲈᛷ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lxhss/ᛶᲈᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lxhss/ᛶᲈᲈᛷ;->ᲇᛴᲇᛵ:Z

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
