.class public final Lyyds/ᛶᛲᛴᛵ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/reflect/Field;

.field public final ᛵᛸᛸᛷ:Ljava/lang/reflect/Field;

.field public final ᲀᛲᛳᲀ:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xfe

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    const-wide v0, -0x3b487e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x3b491e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x3b49de68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛶᛲᛴᛵ;->ᛲᲈᲁ:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    iput-object p2, p0, Lyyds/ᛶᛲᛴᛵ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Field;

    .line 31
    .line 32
    iput-object p3, p0, Lyyds/ᛶᛲᛴᛵ;->ᲀᛲᛳᲀ:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
