.class public final La/A$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:La/A$d;


# instance fields
.field public a:La/A$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/A$d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/A$d;->b:La/A$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
