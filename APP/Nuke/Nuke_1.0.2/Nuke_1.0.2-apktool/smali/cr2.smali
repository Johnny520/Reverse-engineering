.class public final Lcr2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Ldr2;


# direct methods
.method public constructor <init>(Ldr2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcr2;->i:Ldr2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcr2;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    invoke-static {}, Lb93;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcr2;->i:Ldr2;

    .line 5
    .line 6
    iget-object v0, v0, Ldr2;->a:Lf90;

    .line 7
    .line 8
    iget-boolean v1, v0, Lf90;->a:Z

    .line 9
    .line 10
    iget-boolean p0, p0, Lcr2;->h:Z

    .line 11
    .line 12
    iput-boolean p0, v0, Lf90;->a:Z

    .line 13
    .line 14
    if-eq v1, p0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lf90;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lbr2;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lbr2;->a(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
