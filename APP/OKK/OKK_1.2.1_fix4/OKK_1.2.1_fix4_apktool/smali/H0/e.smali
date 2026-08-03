.class public final LH0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH0/d;
.implements Ljava/io/Serializable;


# static fields
.field public static final a:LH0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH0/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LH0/e;->a:LH0/e;

    return-void
.end method


# virtual methods
.method public final a(LH0/b;)LH0/c;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
