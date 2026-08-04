.class public final Lyyds/ᛶᲈᲀᲀ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᛲᲈᲁ:Lyyds/ᛶᛲᛸᛲ;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xbb

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛲᛸᛲ;)V
    .locals 2

    .line 1
    const-wide v0, -0xbc00e68a836eL

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
    iput-object p1, p0, Lyyds/ᛶᲈᲀᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛸᛲ;

    .line 13
    .line 14
    iget-object v0, p1, Lyyds/ᛶᛲᛸᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛶᲈᲀᲀ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p1, Lyyds/ᛶᛲᛸᛲ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, p0, Lyyds/ᛶᲈᲀᲀ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 21
    .line 22
    iget p1, p1, Lyyds/ᛶᛲᛸᛲ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    iput p1, p0, Lyyds/ᛶᲈᲀᲀ;->ᲇᲈᛵᛷ:I

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 v0, 0x23

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lyyds/ᛶᲈᲀᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
