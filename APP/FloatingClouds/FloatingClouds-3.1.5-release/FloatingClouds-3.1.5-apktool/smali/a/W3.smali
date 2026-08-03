.class public final La/W3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/W3$e;,
        La/W3$d;,
        La/W3$a;,
        La/W3$c;,
        La/W3$b;,
        La/W3$f;
    }
.end annotation


# instance fields
.field public final a:La/W3$e;


# direct methods
.method public constructor <init>(La/W3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/W3;->a:La/W3$e;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La/W3;->a:La/W3$e;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
