.class public final Lyyds/ᲇᛸᛸᛳ;
.super Ljava/lang/Object;


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/String;

.field public ᛲᛳᛶᲁ:Lyyds/ᛲᲀᛱᛴ;

.field public ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

.field public ᛲᲈᲁ:J

.field public ᛵᛸᛸᛷ:Ljava/lang/String;

.field public ᛶᛷᛲᲁ:Z

.field public ᛷᲈᲈᲁ:Lyyds/ᲀᛵᛶᲇ;

.field public ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xf4

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const-wide v0, -0x33c0fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-wide v1, -0x33c10e68a836eL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-wide v2, -0x33bfce68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    const-wide v2, -0x33c00e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    iput-wide v2, p0, Lyyds/ᲇᛸᛸᛳ;->ᛲᲈᲁ:J

    .line 41
    .line 42
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    iput-boolean v2, p0, Lyyds/ᲇᛸᛸᛳ;->ᲇᲇᲇᛱ:Z

    .line 53
    .line 54
    iput-boolean v2, p0, Lyyds/ᲇᛸᛸᛳ;->ᛶᛷᛲᲁ:Z

    .line 55
    .line 56
    iput-object v1, p0, Lyyds/ᲇᛸᛸᛳ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲀᛱᛴ;

    .line 59
    .line 60
    iput-object v0, p0, Lyyds/ᲇᛸᛸᛳ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛵᛶᲇ;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
