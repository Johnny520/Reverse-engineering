.class public final Lnm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;


# static fields
.field public static final b:Lnm;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:LF4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnm;

    invoke-direct {v0}, Lnm;-><init>()V

    sput-object v0, Lnm;->b:Lnm;

    const-string v0, "kotlinx.serialization.json.JsonArray"

    sput-object v0, Lnm;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lvm;->a:Lvm;

    new-instance v1, LF4;

    invoke-virtual {v0}, Lvm;->getDescriptor()LCx;

    move-result-object v0

    invoke-direct {v1, v0}, Lwo;-><init>(LCx;)V

    iput-object v1, p0, Lnm;->a:LF4;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0, p1}, Lwo;->a(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lnm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LCz;->h:LCz;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0, p1}, Lwo;->i(I)Ljava/util/List;

    sget-object p1, LKf;->a:LKf;

    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0, p1}, Lwo;->j(I)LCx;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    iget-object v0, p0, Lnm;->a:LF4;

    invoke-virtual {v0, p1}, Lwo;->k(I)Z

    const/4 p1, 0x0

    return p1
.end method
