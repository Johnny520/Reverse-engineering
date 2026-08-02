.class public final Ls71;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnk;


# instance fields
.field public final synthetic a:Lt71;

.field public final synthetic b:Lo72;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lt71;Lo72;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls71;->a:Lt71;

    .line 5
    .line 6
    iput-object p2, p0, Ls71;->b:Lo72;

    .line 7
    .line 8
    iput p3, p0, Ls71;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls71;->b:Lo72;

    .line 2
    .line 3
    iget-object v0, v0, Lo72;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lp71;

    .line 6
    .line 7
    iget v1, p0, Ls71;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Ls71;->a:Lt71;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lt71;->M0(Lp71;I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
