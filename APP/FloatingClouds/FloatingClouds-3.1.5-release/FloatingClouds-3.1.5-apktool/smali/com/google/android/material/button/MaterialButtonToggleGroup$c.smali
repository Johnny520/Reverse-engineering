.class public final Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/button/MaterialButtonToggleGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final e:La/s;


# instance fields
.field public final a:La/w4;

.field public final b:La/w4;

.field public final c:La/w4;

.field public final d:La/w4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    sput-object v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:La/s;

    return-void
.end method

.method public constructor <init>(La/w4;La/w4;La/w4;La/w4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->a:La/w4;

    iput-object p3, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->b:La/w4;

    iput-object p4, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c:La/w4;

    iput-object p2, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d:La/w4;

    return-void
.end method
