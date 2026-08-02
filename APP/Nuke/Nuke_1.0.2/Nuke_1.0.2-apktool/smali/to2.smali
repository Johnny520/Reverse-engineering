.class public final Lto2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final h:Lho2;


# direct methods
.method public constructor <init>(Lo32;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lto2;->h:Lho2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lto2;->h:Lho2;

    .line 2
    .line 3
    invoke-interface {p0, p2, p1}, Lho2;->a(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lk20;->h:Lk20;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La83;->a:La83;

    .line 13
    .line 14
    return-object p0
.end method
