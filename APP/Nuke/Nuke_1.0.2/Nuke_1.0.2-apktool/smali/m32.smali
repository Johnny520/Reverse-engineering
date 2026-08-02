.class public final synthetic Lm32;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/pm/ResolveInfo;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/pm/ResolveInfo;ZLjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm32;->h:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lm32;->i:Landroid/content/pm/ResolveInfo;

    .line 7
    .line 8
    iput-boolean p3, p0, Lm32;->j:Z

    .line 9
    .line 10
    iput-object p4, p0, Lm32;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p5, p0, Lm32;->l:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lcz2;

    .line 2
    .line 3
    sget-object v0, Lop0;->f:Lpw;

    .line 4
    .line 5
    iget-boolean v1, p0, Lm32;->j:Z

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v5, Lf13;

    .line 12
    .line 13
    iget-wide v1, p0, Lm32;->l:J

    .line 14
    .line 15
    invoke-direct {v5, v1, v2}, Lf13;-><init>(J)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lm32;->h:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, p0, Lm32;->i:Landroid/content/pm/ResolveInfo;

    .line 21
    .line 22
    iget-object v4, p0, Lm32;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v5}, Lpw;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lcz2;->close()V

    .line 28
    .line 29
    .line 30
    sget-object p0, La83;->a:La83;

    .line 31
    .line 32
    return-object p0
.end method
