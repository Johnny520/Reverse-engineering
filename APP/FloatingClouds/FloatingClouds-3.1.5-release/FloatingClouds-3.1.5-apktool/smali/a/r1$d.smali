.class public final La/r1$d;
.super La/r1$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic c:La/r1;


# direct methods
.method public constructor <init>(La/r1;)V
    .locals 0

    iput-object p1, p0, La/r1$d;->c:La/r1;

    invoke-direct {p0, p1}, La/r1$c;-><init>(La/r1;)V

    return-void
.end method


# virtual methods
.method public final c(IF)V
    .locals 1

    iget-object v0, p0, La/r1$d;->c:La/r1;

    invoke-static {v0, p1, p2}, La/r1;->f(La/r1;IF)V

    return-void
.end method
