.class public abstract LYue/ۥ۠ۦۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static ۥ۟۟۟۠:I = -0x1

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "alpha"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "elevation"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "rotation"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "rotationX"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "rotationY"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "transformPivotX"

.field public static final ۥ۟۟۟ۧ:Ljava/lang/String; = "transformPivotY"

.field public static final ۥ۟۟۟ۨ:Ljava/lang/String; = "transitionPathRotate"

.field public static final ۥ۟۟۠:Ljava/lang/String; = "scaleX"

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "scaleY"

.field public static final ۥ۟۟۠۠:Ljava/lang/String; = "wavePeriod"

.field public static final ۥ۟۟۠ۡ:Ljava/lang/String; = "waveOffset"

.field public static final ۥ۟۟۠ۢ:Ljava/lang/String; = "waveVariesBy"

.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "translationX"

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "translationY"

.field public static final ۥ۟۟۠ۥ:Ljava/lang/String; = "translationZ"

.field public static final ۥ۟۟۠ۦ:Ljava/lang/String; = "progress"

.field public static final ۥ۟۟۠ۧ:Ljava/lang/String; = "CUSTOM"


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/widget/\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, LYue/ۥ۠ۦۥ۟;->ۥ۟۟۟۠:I

    iput v0, p0, LYue/ۥ۠ۦۥ۟;->ۥ:I

    iput v0, p0, LYue/ۥ۠ۦۥ۟;->ۥ۟:I

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۦۥ۟;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract ۥ(Ljava/util/HashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e2\u06df\u06e7\u06df;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract ۥ۟(Ljava/util/HashSet;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦۥ۟;->ۥ۟۟:Ljava/lang/String;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟۟(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public abstract ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/Object;)F
    .locals 1

    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    :goto_0
    return p1
.end method

.method public ۥۣ۟۟۟(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    :goto_0
    return p1
.end method
