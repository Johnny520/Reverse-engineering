.class public final Lyyds/ᛵᛶᛳ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/ArrayList;

.field public ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:F

.field public ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xf3

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-wide v0, -0x36da0e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛵᛶᛳ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lyyds/ᛵᛶᛳ;->ᛵᛸᛸᛷ:Z

    .line 16
    .line 17
    const/high16 p1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput p1, p0, Lyyds/ᛵᛶᛳ;->ᲀᛲᛳᲀ:F

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lyyds/ᛵᛶᛳ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
