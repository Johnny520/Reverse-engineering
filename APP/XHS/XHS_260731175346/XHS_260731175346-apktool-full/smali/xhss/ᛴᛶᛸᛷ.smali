.class public final Lxhss/ᛴᛶᛸᛷ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛱᛱᛲᲇ:I

.field public final ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x16

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ref/WeakReference;I)V
    .locals 2

    .line 1
    const-wide v0, -0x11cd21b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lxhss/ᛴᛶᛸᛷ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    iput p2, p0, Lxhss/ᛴᛶᛸᛷ;->ᛱᛱᛲᲇ:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
