.class public final Lc03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lws1;


# instance fields
.field public final synthetic a:Lb03;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lb03;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc03;->a:Lb03;

    .line 5
    .line 6
    iput-boolean p2, p0, Lc03;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lc03;->a:Lb03;

    .line 2
    .line 3
    iget-boolean p0, p0, Lc03;->b:Z

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lb03;->l(Z)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
