.class public final Ly42;
.super Lq2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ld20;


# instance fields
.field public final synthetic i:Lcom/dokar/quickjs/QuickJs;


# direct methods
.method public constructor <init>(Lcom/dokar/quickjs/QuickJs;)V
    .locals 1

    .line 1
    sget-object v0, Lgd3;->q:Lgd3;

    .line 2
    .line 3
    iput-object p1, p0, Ly42;->i:Lcom/dokar/quickjs/QuickJs;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lq2;-><init>(Lz10;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final p(La20;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly42;->i:Lcom/dokar/quickjs/QuickJs;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/dokar/quickjs/QuickJs;->access$getEvalException$p(Lcom/dokar/quickjs/QuickJs;)Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p2}, Lcom/dokar/quickjs/QuickJs;->access$setEvalException$p(Lcom/dokar/quickjs/QuickJs;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
