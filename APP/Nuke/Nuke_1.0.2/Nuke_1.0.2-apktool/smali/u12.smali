.class public final Lu12;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lsh1;


# instance fields
.field public a:Lcc;

.field public b:Lzm;

.field public c:Z

.field public final d:Lkj1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkj1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lkj1;-><init>(Lu12;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu12;->d:Lkj1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f()Lin0;
    .locals 0

    .line 1
    iget-object p0, p0, Lu12;->a:Lcc;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "onTouchEvent"

    .line 7
    .line 8
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
