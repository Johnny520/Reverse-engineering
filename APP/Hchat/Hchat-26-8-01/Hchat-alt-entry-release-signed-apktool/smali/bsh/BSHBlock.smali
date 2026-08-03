.class Lbsh/BSHBlock;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/BSHBlock$NodeFilter;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final blockId:I

.field private hasClassDeclaration:Z

.field private isFirst:Z

.field public isStatic:Z

.field public isSynchronized:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lbsh/BSHBlock;->isSynchronized:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lbsh/BSHBlock;->isStatic:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lbsh/BSHBlock;->hasClassDeclaration:Z

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lbsh/BSHBlock;->isFirst:Z

    .line 13
    .line 14
    sget-object p1, Lbsh/BlockNameSpace;->blockCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lbsh/BSHBlock;->blockId:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 30
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, v0}, Lbsh/BSHBlock;->eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbsh/BSHBlock;->isSynchronized:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v1}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    monitor-exit v0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1

    .line 25
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v1}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/BSHBlock$NodeFilter;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    iget v2, p0, Lbsh/BSHBlock;->blockId:I

    .line 11
    .line 12
    invoke-static {p3, v2}, Lbsh/BlockNameSpace;->getInstance(Lbsh/NameSpace;I)Lbsh/NameSpace;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p1, p3}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    new-instance p3, Lbsh/BlockNameSpace;

    .line 28
    .line 29
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, p0, Lbsh/BSHBlock;->blockId:I

    .line 34
    .line 35
    invoke-direct {p3, v2, v3}, Lbsh/BlockNameSpace;-><init>(Lbsh/NameSpace;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p3}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object p3, v1

    .line 44
    :goto_0
    iget-boolean v2, p0, Lbsh/BSHBlock;->isSynchronized:Z

    .line 45
    .line 46
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    :try_start_0
    iget-boolean v5, p0, Lbsh/BSHBlock;->isFirst:Z

    .line 52
    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    iget-boolean v5, p0, Lbsh/BSHBlock;->hasClassDeclaration:Z

    .line 56
    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p2

    .line 61
    goto/16 :goto_8

    .line 62
    .line 63
    :cond_2
    :goto_1
    move v5, v2

    .line 64
    :goto_2
    if-ge v5, v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0, v5}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz p4, :cond_3

    .line 71
    .line 72
    invoke-interface {p4, v6}, Lbsh/BSHBlock$NodeFilter;->isVisible(Lbsh/Node;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    instance-of v7, v6, Lbsh/BSHClassDeclaration;

    .line 80
    .line 81
    if-eqz v7, :cond_4

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    iput-boolean v7, p0, Lbsh/BSHBlock;->hasClassDeclaration:Z

    .line 85
    .line 86
    invoke-interface {v6, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_4
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    :goto_4
    if-ge v2, v3, :cond_b

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    instance-of v6, v5, Lbsh/BSHClassDeclaration;

    .line 99
    .line 100
    if-eqz v6, :cond_6

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    if-eqz p4, :cond_7

    .line 104
    .line 105
    invoke-interface {p4, v5}, Lbsh/BSHBlock$NodeFilter;->isVisible(Lbsh/Node;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-nez v6, :cond_7

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    instance-of v6, v5, Lbsh/BSHEnumConstant;

    .line 113
    .line 114
    if-eqz v6, :cond_9

    .line 115
    .line 116
    if-nez v1, :cond_8

    .line 117
    .line 118
    new-instance v1, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    :cond_8
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_9
    invoke-interface {v5, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    instance-of v5, v0, Lbsh/ReturnControl;

    .line 132
    .line 133
    if-eqz v5, :cond_a

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_a
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_b
    :goto_6
    if-eqz v1, :cond_c

    .line 140
    .line 141
    :goto_7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result p4

    .line 145
    if-nez p4, :cond_c

    .line 146
    .line 147
    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    check-cast p4, Lbsh/Node;

    .line 152
    .line 153
    invoke-interface {p4, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_c
    iput-boolean v4, p0, Lbsh/BSHBlock;->isFirst:Z

    .line 158
    .line 159
    if-eqz p3, :cond_d

    .line 160
    .line 161
    invoke-virtual {p1, p3}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 162
    .line 163
    .line 164
    :cond_d
    return-object v0

    .line 165
    :goto_8
    iput-boolean v4, p0, Lbsh/BSHBlock;->isFirst:Z

    .line 166
    .line 167
    if-eqz p3, :cond_e

    .line 168
    .line 169
    invoke-virtual {p1, p3}, Lbsh/CallStack;->swap(Lbsh/NameSpace;)Lbsh/NameSpace;

    .line 170
    .line 171
    .line 172
    :cond_e
    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": static="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lbsh/BSHBlock;->isStatic:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", synchronized="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lbsh/BSHBlock;->isSynchronized:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
