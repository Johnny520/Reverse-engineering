.class public final Lal0;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:Lo72;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Lo72;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lal0;->i:Lo72;

    .line 2
    .line 3
    iput p2, p0, Lal0;->j:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lpl0;

    .line 2
    .line 3
    iget v0, p0, Lal0;->j:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lpl0;->T0(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lal0;->i:Lo72;

    .line 14
    .line 15
    iput-object p1, p0, Lo72;->i:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p1
.end method
