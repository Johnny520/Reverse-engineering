.class public Lg/I;
.super LD/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lg/K;


# direct methods
.method public constructor <init>(Lg/K;)V
    .locals 1

    iput-object p1, p0, Lg/I;->c:Lg/K;

    const/16 v0, 0x13

    invoke-direct {p0, v0, p1}, LD/d;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lg/I;->c:Lg/K;

    invoke-static {v0, p1}, Lg/K;->d(Lg/K;I)V

    return-void
.end method

.method public final v(I)V
    .locals 1

    iget-object v0, p0, Lg/I;->c:Lg/K;

    invoke-static {v0, p1}, Lg/K;->e(Lg/K;I)V

    return-void
.end method
