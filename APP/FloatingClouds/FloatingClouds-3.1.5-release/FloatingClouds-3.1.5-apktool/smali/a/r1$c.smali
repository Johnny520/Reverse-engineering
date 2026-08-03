.class public La/r1$c;
.super La/r1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:La/r1;


# direct methods
.method public constructor <init>(La/r1;)V
    .locals 0

    iput-object p1, p0, La/r1$c;->b:La/r1;

    invoke-direct {p0, p1}, La/r1$b;-><init>(La/r1;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, La/r1$c;->b:La/r1;

    invoke-static {v0, p1}, La/r1;->e(La/r1;I)V

    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, La/r1$c;->b:La/r1;

    invoke-static {v0, p1}, La/r1;->d(La/r1;I)V

    return-void
.end method
