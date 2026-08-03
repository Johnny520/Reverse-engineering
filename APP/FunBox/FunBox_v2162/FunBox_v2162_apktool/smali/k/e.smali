.class public final Lk/e;
.super Lk/l;
.source "SourceFile"


# static fields
.field public static final b:Lk/e;

.field public static final c:Lk/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk/e;-><init>(Z)V

    sput-object v0, Lk/e;->b:Lk/e;

    new-instance v0, Lk/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk/e;-><init>(Z)V

    sput-object v0, Lk/e;->c:Lk/e;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lk/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk/l;->h()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "true"

    goto :goto_1

    :cond_1
    const-string v0, "false"

    :goto_1
    return-object v0
.end method

.method public final c()Ll/c;
    .locals 1

    sget-object v0, Ll/c;->g:Ll/c;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    const-string v0, "boolean"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk/l;->h()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "boolean{true}"

    goto :goto_1

    :cond_1
    const-string v0, "boolean{false}"

    :goto_1
    return-object v0
.end method
