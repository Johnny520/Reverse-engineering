.class public final synthetic Lna2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Lya2;

.field public final synthetic η:Lab2;

.field public final synthetic θ:J

.field public final synthetic ι:Ljava/lang/reflect/Method;

.field public final synthetic κ:Ljava/lang/Object;

.field public final synthetic λ:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lya2;Lab2;JLjava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lna2;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lna2;->ζ:Lya2;

    .line 7
    .line 8
    iput-object p3, p0, Lna2;->η:Lab2;

    .line 9
    .line 10
    iput-wide p4, p0, Lna2;->θ:J

    .line 11
    .line 12
    iput-object p6, p0, Lna2;->ι:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iput-object p7, p0, Lna2;->κ:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p8, p0, Lna2;->λ:[Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    check-cast v3, Lqa2;

    .line 6
    .line 7
    move-object/from16 v8, p2

    .line 8
    .line 9
    check-cast v8, Le80;

    .line 10
    .line 11
    move-object/from16 v15, p3

    .line 12
    .line 13
    check-cast v15, Lp70;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v10, v0, Lna2;->η:Lab2;

    .line 25
    .line 26
    iget-object v4, v10, Lab2;->ε:Ljava/io/File;

    .line 27
    .line 28
    iget-object v7, v10, Lab2;->η:Ljava/util/List;

    .line 29
    .line 30
    new-instance v9, Lgc;

    .line 31
    .line 32
    const/16 v16, 0x3

    .line 33
    .line 34
    iget-object v2, v0, Lna2;->ζ:Lya2;

    .line 35
    .line 36
    iget-object v12, v0, Lna2;->ι:Ljava/lang/reflect/Method;

    .line 37
    .line 38
    iget-object v13, v0, Lna2;->κ:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v14, v0, Lna2;->λ:[Ljava/lang/Object;

    .line 41
    .line 42
    move-object v11, v2

    .line 43
    invoke-direct/range {v9 .. v16}, Lgc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v10, Ljava/lang/Thread;

    .line 47
    .line 48
    new-instance v1, Lja2;

    .line 49
    .line 50
    move-object v5, v1

    .line 51
    iget-object v1, v0, Lna2;->ε:Landroid/app/Activity;

    .line 52
    .line 53
    iget-wide v11, v0, Lna2;->θ:J

    .line 54
    .line 55
    move-object v0, v5

    .line 56
    move-wide v5, v11

    .line 57
    invoke-direct/range {v0 .. v9}, Lja2;-><init>(Landroid/content/Context;Lya2;Lqa2;Ljava/io/File;JLjava/util/List;Le80;Lgc;)V

    .line 58
    .line 59
    .line 60
    const-string v1, "DY-VoiceReplace"

    .line 61
    .line 62
    invoke-direct {v10, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    .line 66
    .line 67
    .line 68
    sget-object v0, Ls62;->α:Ls62;

    .line 69
    .line 70
    return-object v0
.end method
