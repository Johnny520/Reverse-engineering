.class public abstract Lwf3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lrk1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Led2;->a:[J

    .line 2
    .line 3
    new-instance v0, Lrk1;

    .line 4
    .line 5
    invoke-direct {v0}, Lrk1;-><init>()V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwf3;->a:Lrk1;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Landroid/view/View;)Lyx;
    .locals 1

    .line 1
    const v0, 0x7908002b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lyx;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lyx;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
