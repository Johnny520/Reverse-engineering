.class public final Lx42;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Lil1;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lcom/dokar/quickjs/QuickJs;

.field public n:I


# direct methods
.method public constructor <init>(Lcom/dokar/quickjs/QuickJs;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx42;->m:Lcom/dokar/quickjs/QuickJs;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lu00;-><init>(Lt00;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lx42;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lx42;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lx42;->n:I

    .line 9
    .line 10
    iget-object p1, p0, Lx42;->m:Lcom/dokar/quickjs/QuickJs;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lcom/dokar/quickjs/QuickJs;->access$loadModules(Lcom/dokar/quickjs/QuickJs;Lt00;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
