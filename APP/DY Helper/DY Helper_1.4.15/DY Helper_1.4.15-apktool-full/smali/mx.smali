.class public final synthetic Lmx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic α:Ljava/lang/String;

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:La80;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmx;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lmx;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lmx;->γ:La80;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lmx;->α:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lmx;->β:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lmx;->γ:La80;

    .line 8
    .line 9
    invoke-static {v0, v1, p0}, Lox;->ε(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
