.class public final La/S6$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/S6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/S6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:La/M6;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/M6;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/S6$e;->a:La/M6;

    iput p2, p0, La/S6$e;->c:I

    iput p3, p0, La/S6$e;->b:I

    iput-object p4, p0, La/S6$e;->d:Ljava/lang/String;

    return-void
.end method
