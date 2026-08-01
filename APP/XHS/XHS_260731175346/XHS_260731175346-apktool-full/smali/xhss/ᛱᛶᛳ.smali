.class public final Lxhss/ᛱᛶᛳ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/List;

.field public final ᛷᛵᛵᲈ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 2

    .line 1
    const-wide v0, -0x132191b858845L

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
    iput-object p1, p0, Lxhss/ᛱᛶᛳ;->ᛷᛵᛵᲈ:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, p0, Lxhss/ᛱᛶᛳ;->ᛱᛱᛲᲇ:Ljava/util/List;

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
