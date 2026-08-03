.class public final LZC;
.super Lbc;
.source ""


# static fields
.field public static final b:LZC;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZC;

    invoke-direct {v0}, Lbc;-><init>()V

    sput-object v0, LZC;->b:LZC;

    return-void
.end method


# virtual methods
.method public final t(Lac;Ljava/lang/Runnable;)V
    .locals 1

    sget-object p1, Lhd;->c:Lhd;

    const/4 v0, 0x1

    iget-object p1, p1, Llx;->b:Lec;

    invoke-virtual {p1, p2, v0}, Lec;->f(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method

.method public final v(I)Lbc;
    .locals 1

    invoke-static {p1}, LOj;->i(I)V

    sget v0, LmA;->d:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lbc;->v(I)Lbc;

    move-result-object p1

    return-object p1
.end method
