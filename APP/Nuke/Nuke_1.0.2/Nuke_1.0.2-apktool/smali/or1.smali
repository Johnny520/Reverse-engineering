.class public final synthetic Lor1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:F

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(FFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lor1;->h:F

    .line 5
    .line 6
    iput p2, p0, Lor1;->i:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, Lpp0;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget v0, p0, Lor1;->h:F

    .line 14
    .line 15
    iget p0, p0, Lor1;->i:F

    .line 16
    .line 17
    invoke-static {v0, p0, p1, p2}, Lsp0;->j(FFLpx;I)V

    .line 18
    .line 19
    .line 20
    sget-object p0, La83;->a:La83;

    .line 21
    .line 22
    return-object p0
.end method
